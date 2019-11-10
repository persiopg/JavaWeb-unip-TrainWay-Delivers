/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tb_lanches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbLanches.findAll", query = "SELECT t FROM TbLanches t")
    , @NamedQuery(name = "TbLanches.findByIdLanche", query = "SELECT t FROM TbLanches t WHERE t.idLanche = :idLanche")
    , @NamedQuery(name = "TbLanches.findByNmLanche", query = "SELECT t FROM TbLanches t WHERE t.nmLanche = :nmLanche")
    , @NamedQuery(name = "TbLanches.findByPreco", query = "SELECT t FROM TbLanches t WHERE t.preco = :preco")
    , @NamedQuery(name = "TbLanches.findByDescr", query = "SELECT t FROM TbLanches t WHERE t.descr = :descr")
    , @NamedQuery(name = "TbLanches.findByQte", query = "SELECT t FROM TbLanches t WHERE t.qte = :qte")
    , @NamedQuery(name = "TbLanches.findByCaminhoimg", query = "SELECT t FROM TbLanches t WHERE t.caminhoimg = :caminhoimg")})
public class TbLanches implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lanche")
    private Integer idLanche;
    @Size(max = 60)
    @Column(name = "nm_lanche")
    private String nmLanche;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Size(max = 255)
    @Column(name = "descr")
    private String descr;
    @Column(name = "qte")
    private Integer qte;
    @Size(max = 60)
    @Column(name = "caminhoimg")
    private String caminhoimg;
    @OneToMany(mappedBy = "idLanches")
    private Collection<TbVenda> tbVendaCollection;

    public TbLanches() {
    }

    public TbLanches(Integer idLanche) {
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public String getCaminhoimg() {
        return caminhoimg;
    }

    public void setCaminhoimg(String caminhoimg) {
        this.caminhoimg = caminhoimg;
    }

    @XmlTransient
    public Collection<TbVenda> getTbVendaCollection() {
        return tbVendaCollection;
    }

    public void setTbVendaCollection(Collection<TbVenda> tbVendaCollection) {
        this.tbVendaCollection = tbVendaCollection;
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
        if (!(object instanceof TbLanches)) {
            return false;
        }
        TbLanches other = (TbLanches) object;
        if ((this.idLanche == null && other.idLanche != null) || (this.idLanche != null && !this.idLanche.equals(other.idLanche))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbLanches[ idLanche=" + idLanche + " ]";
    }
    
}
