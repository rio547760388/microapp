package microapp.aop

import io.micronaut.context.annotation.Requirements
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import microapp.common.Result
import org.slf4j.LoggerFactory
import javax.inject.Singleton

/**
 * @author Administrator
 * @since 2020/7/26
 * 说明：
 */
@Produces
@Singleton
@Requirements(
        Requires(classes = [RuntimeException::class, ExceptionHandler::class])
)
class EndpointExHandler : ExceptionHandler<RuntimeException, HttpResponse<*>> {
    private val logger = LoggerFactory.getLogger(EndpointExHandler::class.java)

    override fun handle(request: HttpRequest<*>, exception: RuntimeException): HttpResponse<*> {
        logger.error("{}", exception)

        return HttpResponse.ok(Result.error())
    }
}