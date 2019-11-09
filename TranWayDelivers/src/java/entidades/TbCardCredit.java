/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tb_card_credit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCardCredit.findAll", query = "SELECT t FROM TbCardCredit t")
    , @NamedQuery(name = "TbCardCredit.findByNumCred", query = "SELECT t FROM TbCardCredit t WHERE t.numCred = :numCred")
    , @NamedQuery(name = "TbCardCredit.findByCodSeg", query = "SELECT t FROM TbCardCredit t WHERE t.codSeg = :codSeg")
    , @NamedQuery(name = "TbCardCredit.findByVencCart", query = "SELECT t FROM TbCardCredit t WHERE t.vencCart = :vencCart")})
public class TbCardCredit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_cred")
    private Integer numCred;
    @Column(name = "cod_seg")
    private Integer codSeg;
    @Size(max = 20)
    @Column(name = "venc_cart")
    private String vencCart;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private TbCliente idCliente;

    public TbCardCredit() {
    }

    public TbCardCredit(Integer numCred) {
        this.numCred = numCred;
    }

    public Integer getNumCred() {
        return numCred;
    }

    public void setNumCred(Integer numCred) {
        this.numCred = numCred;
    }

    public Integer getCodSeg() {
        return codSeg;
    }

    public void setCodSeg(Integer codSeg) {
        this.codSeg = codSeg;
    }

    public String getVencCart() {
        return vencCart;
    }

    public void setVencCart(String vencCart) {
        this.vencCart = vencCart;
    }

    public TbCliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(TbCliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numCred != null ? numCred.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCardCredit)) {
            return false;
        }
        TbCardCredit other = (TbCardCredit) object;
        if ((this.numCred == null && other.numCred != null) || (this.numCred != null && !this.numCred.equals(other.numCred))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbCardCredit[ numCred=" + numCred + " ]";
    }
    
}
