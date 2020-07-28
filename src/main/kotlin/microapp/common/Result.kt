package microapp.common

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonInclude
import java.time.LocalDateTime
import java.util.*
import javax.xml.bind.annotation.XmlRootElement

/**
 * @author Administrator
 * @since 2020/7/26
 * 说明：
 */
@XmlRootElement
data class Result<T>(
        var status: Int? = null,
        var message: String = "",
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        var timestamp: LocalDateTime? = LocalDateTime.now(),
        @JsonInclude
        var data: T? = null
) {
    companion object {
        fun ok(): Result<Nothing> {
            return Result(0, "成功", LocalDateTime.now(), null)
        }

        fun <T> ok(data: T): Result<T> {
            return Result(0, "成功", LocalDateTime.now(), data)
        }

        fun error(): Result<Nothing> {
            return Result(10000, "系统异常", LocalDateTime.now(), null)
        }

        fun error(message: String): Result<Nothing> {
            return Result(10000, message, LocalDateTime.now(), null)
        }
    }
}