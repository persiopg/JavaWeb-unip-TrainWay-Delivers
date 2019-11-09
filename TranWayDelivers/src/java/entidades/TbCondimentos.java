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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tb_condimentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCondimentos.findAll", query = "SELECT t FROM TbCondimentos t")
    , @NamedQuery(name = "TbCondimentos.findByIdCond", query = "SELECT t FROM TbCondimentos t WHERE t.idCond = :idCond")
    , @NamedQuery(name = "TbCondimentos.findByQte", query = "SELECT t FROM TbCondimentos t WHERE t.qte = :qte")
    , @NamedQuery(name = "TbCondimentos.findByNmCond", query = "SELECT t FROM TbCondimentos t WHERE t.nmCond = :nmCond")
    , @NamedQuery(name = "TbCondimentos.findByPreco", query = "SELECT t FROM TbCondimentos t WHERE t.preco = :preco")
    , @NamedQuery(name = "TbCondimentos.findByDescr", query = "SELECT t FROM TbCondimentos t WHERE t.descr = :descr")
    , @NamedQuery(name = "TbCondimentos.findByCaminhoimg", query = "SELECT t FROM TbCondimentos t WHERE t.caminhoimg = :caminhoimg")})
public class TbCondimentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cond")
    private Integer idCond;
    @Column(name = "qte")
    private Integer qte;
    @Size(max = 60)
    @Column(name = "nm_cond")
    private String nmCond;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Size(max = 255)
    @Column(name = "descr")
    private String descr;
    @Size(max = 60)
    @Column(name = "caminhoimg")
    private String caminhoimg;
    @OneToMany(mappedBy = "idCond")
    private Collection<TbLancheCriados> tbLancheCriadosCollection;

    public TbCondimentos() {
    }

    public TbCondimentos(Integer idCond) {
        this.idCond = idCond;
    }

    public Integer getIdCond() {
        return idCond;
    }

    public void setIdCond(Integer idCond) {
        this.idCond = idCond;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public String getNmCond() {
        return nmCond;
    }

    public void setNmCond(String nmCond) {
        this.nmCond = nmCond;
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

    public String getCaminhoimg() {
        return caminhoimg;
    }

    public void setCaminhoimg(String caminhoimg) {
        this.caminhoimg = caminhoimg;
    }

    @XmlTransient
    public Collection<TbLancheCriados> getTbLancheCriadosCollection() {
        return tbLancheCriadosCollection;
    }

    public void setTbLancheCriadosCollection(Collection<TbLancheCriados> tbLancheCriadosCollection) {
        this.tbLancheCriadosCollection = tbLancheCriadosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCond != null ? idCond.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCondimentos)) {
            return false;
        }
        TbCondimentos other = (TbCondimentos) object;
        if ((this.idCond == null && other.idCond != null) || (this.idCond != null && !this.idCond.equals(other.idCond))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbCondimentos[ idCond=" + idCond + " ]";
    }
    
}
