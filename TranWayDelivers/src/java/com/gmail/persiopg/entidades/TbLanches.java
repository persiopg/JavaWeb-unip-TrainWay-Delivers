/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.persiopg.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tb_lanches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbLanches_1.findAll", query = "SELECT t FROM TbLanches_1 t"),
    @NamedQuery(name = "TbLanches_1.findByIdLanche", query = "SELECT t FROM TbLanches_1 t WHERE t.idLanche = :idLanche"),
    @NamedQuery(name = "TbLanches_1.findByNmLanche", query = "SELECT t FROM TbLanches_1 t WHERE t.nmLanche = :nmLanche"),
    @NamedQuery(name = "TbLanches_1.findByPreco", query = "SELECT t FROM TbLanches_1 t WHERE t.preco = :preco"),
    @NamedQuery(name = "TbLanches_1.findByTempomont", query = "SELECT t FROM TbLanches_1 t WHERE t.tempomont = :tempomont"),
    @NamedQuery(name = "TbLanches_1.findByCaminhoimg", query = "SELECT t FROM TbLanches_1 t WHERE t.caminhoimg = :caminhoimg")})
public class TbLanches_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_lanche")
    private Integer idLanche;
    @Column(name = "nm_lanche")
    private String nmLanche;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private BigDecimal preco;
    @Column(name = "tempomont")
    private BigDecimal tempomont;
    @Column(name = "caminhoimg")
    private String caminhoimg;

    public TbLanches_1() {
    }

    public TbLanches_1(Integer idLanche) {
        this.idLanche = idLanche;
    }

    public Integer getIdLanche() {
        return idLanche;
    }

    public void setIdLanche(Integer idLanche) {
        this.idLanche = idLanche;
    }

    public String getNmLanche() {
        return nmLanche;
    }

    public void setNmLanche(String nmLanche) {
        this.nmLanche = nmLanche;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getTempomont() {
        return tempomont;
    }

    public void setTempomont(BigDecimal tempomont) {
        this.tempomont = tempomont;
    }

    public String getCaminhoimg() {
        return caminhoimg;
    }

    public void setCaminhoimg(String caminhoimg) {
        this.caminhoimg = caminhoimg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLanche != null ? idLanche.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbLanches_1)) {
            return false;
        }
        TbLanches_1 other = (TbLanches_1) object;
        if ((this.idLanche == null && other.idLanche != null) || (this.idLanche != null && !this.idLanche.equals(other.idLanche))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gmail.persiopg.entidades.TbLanches_1[ idLanche=" + idLanche + " ]";
    }
    
}
