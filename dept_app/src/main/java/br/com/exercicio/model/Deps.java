package br.com.exercicio.model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity(name = "deps")
public class Deps {

	@Id
	@Column(name = "DEPT")
	private Long dept;
	
	@Column(name = "DEPT_NAME")
	private String deptName;
	
	@Column(name =  "BUYER")
	private Integer buyer;
	
	@Column(name =  "MERCH")
	private Integer merch;
	
	@Column(name =  "PROFIT_CALC_TYPE")
	private Integer profitCalcType;
	
	@Column(name =  "PURCHASE_TYPE")
	private Integer purchaseType;
	
	@Column(name =  "GROUP_NO")
	private Integer groupNo;
	
	@Column(name =  "BUD_INT")
	private Double budInt;
	
	@Column(name =  "BUD_MKUP")
	private Double budMkp;
	
	@Column(name =  "TOTAL_MARKET_AMT")
	private Double totalMarketAmt;
	
	@Column(name =  "MARKUP_CALC_TYPE")
	private String markupCalcType;
	
	@Column(name =  "OTB_CALC_TYPE")
	private String otbCalcType;
	
	@Column(name =  "AVG_TOLERANCE_PCT")
	private Double avgTolerancePct;
	
	@Column(name =  "DEPT_VAT_INCL_IND")
	private String deptVatInclInd;
	
	@Column(name =  "CREATE_ID")
	private String createId;
	
	@Column(name =  "CREATE_DATETIME")
	@Temporal(TemporalType.DATE)
	private Date createDatetime;
	
	@Column(name =  "CREAT_ID")
	private String creatId;
	
	@Column(name =  "CREATE_DATE_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDateTime;
	
	@Column(name =  "MAX_AVG_COUNTER")
	private Integer maxAvgCounter;
	
	@Column(name =  "MERCHE")
	private Integer merche;
	
	@Column(name =  "NAME")
	private String name;
}