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
@Table(name = "role")
data class Role(
        @Id var id: Long? = null,
        @Column(name = "role_name") var roleName: String? = null,
        @Column var description: String? = null,
        @Column(name = "create_time") var createTime: LocalDateTime? = null,
        @OneToMany @JoinColumn(name = "role_id", referencedColumnName = "id") var roleMenus: List<RoleMenu>? = null
)