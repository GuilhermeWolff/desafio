package br.com.exercicio.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity(name = "class")
public class Classe {

	@Id
	@Column(name = "DEPT")
	private Long dept;
	
	@Column(name = "CLASS")
	private Long classe;
	
	@Column(name = "CLASS_NAME")
	private String className;
	
	@Column(name ="CLASS_VAT_IND")
	private String classVatInd;
	
	@Column(name ="CREATE_ID")
	private String createId;
	
	@Column(name ="CREATE_DATETIME")
	@Temporal(TemporalType.DATE)
	private Date createDateTime;
	
	@Column(name ="CLASS_ID")
	private Integer classId;	
}