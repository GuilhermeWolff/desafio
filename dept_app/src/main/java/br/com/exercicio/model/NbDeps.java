package br.com.exercicio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity(name = "nb_deps")
public class NbDeps {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPT",unique = true)
	private Long dept;
	
	@Column(name = "AVG_TOLERANCE_PCT")
	private Float avgTolerancePct;
	
	@Column(name = "BUD_INT")
	private Float budInt;
	
	@Column(name = "BUD_MKUP")
	private Float budMkup;
	
	@Column(name = "BUYER")
	private Integer buyer;
	
	@Column(name = "CREATE_DATETIME")
	@Temporal(TemporalType.DATE)
	private String createDateTime;
	
	@Column(name = "CREATE_ID")
	private String createId;
	
	@Column(name = "DEPT_NAME")
	private String deptName;
	
	@Column(name = "DEPT_VAT_INCL_IND")
	private String deptVatInclInd;
	
	@Column(name = "GROUP_NO")
	private Integer groupNo;
	
	@Column(name = "MARKUP_CALC_TYPE")
	private String markupCalcType;
	
	@Column(name = "MAX_AVG_COUNTER")
	private Float maxAvgCounter;
	
	@Column(name = "MERCH")
	private Integer merch;
	
	@Column(name = "OTB_CALC_TYPE")
	private String otbCalcType;
	
	@Column(name = "PROFIT_CALC_TYPE")
	private Integer profitCalcType;
	
	@Column(name = "PURCHASE_TYPE")
	private Integer purchaseType;
	
	@Column(name = "TOTAL_MARKET_AMT")
	private Integer totalMarketAmt;
	
	@Column(name = "MERCHE")
	private Integer merche;	
	
}
