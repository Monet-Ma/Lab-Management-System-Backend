package njust.lmsbackend.lms.POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_seat")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class ComputerLabPOJO {
    @Id
    @Column(name = "id")
    private int seatId;
    private int labId;
    private int state;

    public SeatPOJO() {
    }

    public SeatPOJO(int seatId, int labId, int state) {
        this.seatId = seatId;
        this.labId = labId;
        this.state = state;
    }

    public int getSeatId() { return seatId; }

    public void setSeatId(int id) {
        this.seatId = seatId;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}