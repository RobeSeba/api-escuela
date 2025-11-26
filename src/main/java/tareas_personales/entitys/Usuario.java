package tareas_personales.entitys;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column(name="name" , length = 50 ,nullable = false)
    private String name;
    @Column(name = "last_name",length =50, nullable = false )
    private String lastName;
    @Column(name="email",unique = true ,nullable = false)
    private String email;
    @Column(name="password",nullable = false)
    private String password;
    @Column()
    private boolean Active = true;
}
