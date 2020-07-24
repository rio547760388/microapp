package microapp.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

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
        @Column(name= "name") var name: String? = null,
        @Column(name= "address") var address: String? = null,
        @Column(name = "age") var age: Int? = null
)