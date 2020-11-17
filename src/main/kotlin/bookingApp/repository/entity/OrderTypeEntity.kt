package bookingApp.repository.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "BookingTable")
class OrderTypeEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Int? = null,

        val name: String,
): Serializable
