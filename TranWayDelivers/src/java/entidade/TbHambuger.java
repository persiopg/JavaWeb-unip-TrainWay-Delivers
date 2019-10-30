/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

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
@Table(name = "tb_hambuger")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbHambuger.findAll", query = "SELECT t FROM TbHambuger t")
    , @NamedQuery(name = "TbHambuger.findByIdHambuger", query = "SELECT t FROM TbHambuger t WHERE t.idHambuger = :idHambuger")
    , @NamedQuery(name = "TbHambuger.findByQte", query = "SELECT t FROM TbHambuger t WHERE t.qte = :qte")
    , @NamedQuery(name = "TbHambuger.findByNmHambuger", query = "SELECT t FROM TbHambuger t WHERE t.nmHambuger = :nmHambuger")
    , @NamedQuery(name = "TbHambuger.findByPreco", query = "SELECT t FROM TbHambuger t WHERE t.preco = :preco")
    , @NamedQuery(name = "TbHambuger.findByDescr", query = "SELECT t FROM TbHambuger t WHERE t.descr = :descr")
    , @NamedQuery(name = "TbHambuger.findByCaminhoimg", query = "SELECT t FROM TbHambuger t WHERE t.caminhoimg = :caminhoimg")})
public class TbHambuger implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_hambuger")
    private Integer idHambuger;
    @Column(name = "qte")
    private Integer qte;
    @Size(max = 60)
    @Column(name = "nm_hambuger")
    private String nmHambuger;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Size(max = 255)
    @Column(name = "descr")
    private String descr;
    @Size(max = 60)
    @Column(name = "caminhoimg")
    private String caminhoimg;
    @OneToMany(mappedBy = "idHambuger")
    private Collection<TbLancheCriados> tbLancheCriadosCollection;

    public TbHambuger() {
    }

    public TbHambuger(Integer idHambuger) {
        this.idHambuger = idHambuger;
    }

    public Integer getIdHambuger() {
        return idHambuger;
    }

    public void setIdHambuger(Integer idHambuger) {
        this.idHambuger = idHambuger;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public String getNmHambuger() {
        return nmHambuger;
    }

    public void setNmHambuger(String nmHambuger) {
        this.nmHambuger = nmHambuger;
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
        hash += (idHambuger != null ? idHambuger.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbHambuger)) {
            return false;
        }
        TbHambuger other = (TbHambuger) object;
        if ((this.idHambuger == null && other.idHambuger != null) || (this.idHambuger != null && !this.idHambuger.equals(other.idHambuger))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.TbHambuger[ idHambuger=" + idHambuger + " ]";
    }
    
}
