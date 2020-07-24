package microapp.endpoint

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.QueryValue
import microapp.entity.Users
import microapp.repository.UsersRepository
import javax.inject.Inject

/**
 * @author Mloong
 * @since 2020/7/22
 * @version 0.0.1
 * <p></p>
 **/
@Controller
class IndexEndpoint {
    @Inject
    lateinit var userRepository: UsersRepository

    @Get(uri = "/")
    fun index(id: Long): Users? {
        return userRepository.findById(id).orElse(null)
    }

    @Get(uri = "/{name}")
    fun userByName(@QueryValue("name") name: String): Users? {
        return userRepository.findByName(name)
    }

    @Post(uri = "/")
    fun addUser(user: Users): Users {
        userRepository.save(user)
        return user
    }

}