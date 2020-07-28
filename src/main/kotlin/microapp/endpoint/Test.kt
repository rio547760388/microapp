package microapp.endpoint

import java.io.StringWriter
import javax.xml.bind.JAXB
import javax.xml.bind.JAXBContext
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

/**
 * @author Mloong
 * @since 2020/7/28
 * @version 0.0.1
 * <p></p>
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TEXT")
class Text {
    @XmlElement(name = "Aa")
    var a: String? = null

    @XmlElement(name = "Ba")
    var b: Int? = null

    override fun toString(): String {
        return "Text(a=$a, b=$b)"
    }
}

fun main() {
    val o = Text()
    var s = "d:\\a.xml"
    o.a = "A"
    o.b = 1
    //var os = ByteArrayOutputStream()
    JAXB.marshal(o, s)

    //os.writeTo(FileOutputStream("d:\\a.xml"))

    var t = JAXB.unmarshal(s, Text::class.java)
    println(t)

    var sw = StringWriter()
    JAXBContext.newInstance(Text::class.java).createMarshaller().marshal(o, sw)
    println(sw)
}