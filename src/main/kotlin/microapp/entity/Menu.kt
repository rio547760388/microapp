package microapp.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author Mloong
 * @since 2020/7/27
 * @version 0.0.1
 * <p></p>
 **/
@Entity
@Table(name = "menu")
data class Menu(
        @Id var id: Long? = null,
        @Column(name = "menu_name") var menuName: String? = null,
        @Column var uri: String? = null,
        @Column var sort: Int? = null,
        @Column(name = "super_id", columnDefinition = "int4 default 0") var superId: Long = 0,
        @Column(name = "create_time") var createTime: LocalDateTime? = null
)