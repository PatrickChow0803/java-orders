package local.patrickchow0803.patrickchow0803.models;

import javax.persistence.*;

@Entity
@Table(name = "agents")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long agentcode;

    private String agentname;
    private String workingarea;
    private double commission;
    private String phone;
    private String country;

}
