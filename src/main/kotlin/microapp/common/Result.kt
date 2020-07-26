package microapp.common

/**
 * @author Administrator
 * @since 2020/7/26
 * 说明：
 */
data class Result<T> (
    var status: Int? = null,
    var data: T? = null
)