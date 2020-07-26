package microapp.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author Administrator
 * @since 2020/7/26
 * 说明：
 */
@Entity
@Table(name = "account")
data class Account(
        @Id() var id: Long? = null,
        @Column() var amount: Double? = null,
        var currency: Currency? = null
)