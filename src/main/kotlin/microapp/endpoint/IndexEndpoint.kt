package microapp.endpoint

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.QueryValue
import microapp.common.Result
import microapp.entity.Users
import microapp.repository.UsersRepository
import javax.inject.Inject

/**
 * @author Mloong
 * @since 2020/7/22
 * @version 0.0.1
 * <p></p>
 **/
@Controller(
        value = "/",
        produces = [MediaType.APPLICATION_JSON, MediaType.APPLICATION_XHTML, MediaType.APPLICATION_XML]
)
class IndexEndpoint {
    @Inject
    lateinit var userRepository: UsersRepository

    @Get
    fun index(): Result<String> {
        return Result.ok("Index page")
    }

    @Get(uri = "{name}")
    fun userByName(@QueryValue("name") name: String): Result<Users?> {
        return Result.ok(userRepository.findByName(name))
    }

    @Post
    fun addUser(user: Users): Result<Users> {
        return Result.ok(userRepository.save(user))
    }

    @Get("xml")
    fun xmltest(): Map<String, Int> {
        return mapOf(Pair("a",1),
                Pair("b",2)
        )
    }
}