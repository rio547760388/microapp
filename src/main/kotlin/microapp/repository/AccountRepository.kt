package microapp.repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import microapp.entity.Account

/**
 * @author Administrator
 * @since 2020/7/26
 * 说明：
 */
@Repository
interface AccountRepository : JpaRepository<Account, Long> {

}