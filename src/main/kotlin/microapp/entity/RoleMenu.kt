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
@Table(name = "role_menu")
data class RoleMenu(
        @Id var id: Long? = null,
        @Column(name = "role_id") var roleId: Long? = null,
        @Column(name = "menu_id") var menuId: Long? = null,
        @Column(name = "create_time") var createTime: LocalDateTime? = null,
        @OneToMany @JoinColumn(name = "id", referencedColumnName = "menu_id") var menus: List<Menu>
)