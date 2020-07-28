package microapp.entity

import java.time.LocalDateTime
import javax.persistence.*

/**
 * @author Mloong
 * @since 2020/7/22
 * @version 0.0.1
 * <p></p>
 **/
@Entity
@Table(name = "users")
data class Users constructor(
        @Id var id: Long? = null,
        @Column(name = "user_name", columnDefinition = "varchar(100)") var username: String? = null,
        @Column(name = "password") var password: String? = null,
        @Column(name = "enabled") var enabled: Int? = null,
        @Column(name = "create_time") var createTime: LocalDateTime? = null,
        @Column(name = "update_time") var updateTime: LocalDateTime? = null,
        @Column(name = "last_login") var lastLogin: LocalDateTime? = null,
        @OneToMany @JoinColumn(name = "user_id", referencedColumnName = "id") var userRoles: List<UserRole>
)