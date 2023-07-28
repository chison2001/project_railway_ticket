package vn.edu.iuh.railway_ticket.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tickets")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String maVe;
    private String tenChuyenTau;
    private String tenKH;
    private String category;
    private int soGhe;
    private Date datepost = new Date(System.currentTimeMillis());
    private String description;
    private String noiDi;
    private String noiDen;
    private double giaTien;
	public Product() {
		
	}
	public Product(Long id, String maVe, String tenChuyenTau, String tenKH, String category, int soGhe, Date datepost,
			String description, String noiDi, String noiDen, double giaTien) {
		super();
		this.id = id;
		this.maVe = maVe;
		this.tenChuyenTau = tenChuyenTau;
		this.tenKH = tenKH;
		this.category = category;
		this.soGhe = soGhe;
		this.datepost = datepost;
		this.description = description;
		this.noiDi = noiDi;
		this.noiDen = noiDen;
		this.giaTien = giaTien;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	public String getTenChuyenTau() {
		return tenChuyenTau;
	}
	public void setTenChuyenTau(String tenChuyenTau) {
		this.tenChuyenTau = tenChuyenTau;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getSoGhe() {
		return soGhe;
	}
	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}
	public Date getDatepost() {
		return datepost;
	}
	public void setDatepost(Date datepost) {
		this.datepost = datepost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNoiDi() {
		return noiDi;
	}
	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	
	
	

}
