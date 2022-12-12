package in.phonebook.binding;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Contact {
	
	@Id
	@GeneratedValue
	private Integer contactId;
	private String contactName;
    private String contactEmail;
    private Long contactNumber;
}
