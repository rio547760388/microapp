package microapp.repository

import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import microapp.entity.Users

/**
 * @author Mloong
 * @since 2020/7/27
 * @version 0.0.1
 * <p></p>
 **/
@Repository
interface UsersRepository : JpaRepository<Users, Long> {
    @Query("""
        select u from Users u
        where u.username = :name
    """)
    fun findByName(name: String): Users?
}