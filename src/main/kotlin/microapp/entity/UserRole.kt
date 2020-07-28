package microapp.entity

import java.time.LocalDateTime
import javax.persistence.*

/**
 * @author Mloong
 * @since 2020/7/27
 * @version 0.0.1
 * <p></p>
 **/
@Entity
@Table(name = "user_role")
data class UserRole(
        @Id var id: Long? = null,
        @Column(name = "user_id") var userId: Long? = null,
        @Column(name = "role_id") var roleId: Long? = null,
        @Column(name = "create_time") var createTime: LocalDateTime? = null,
        @OneToMany @JoinColumn(name = "id", referencedColumnName = "role_id") var roles: List<Role>? = null
)
