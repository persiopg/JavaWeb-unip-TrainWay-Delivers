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
@Table(name = "tb_queijo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbQueijo.findAll", query = "SELECT t FROM TbQueijo t")
    , @NamedQuery(name = "TbQueijo.findByIdQueijo", query = "SELECT t FROM TbQueijo t WHERE t.idQueijo = :idQueijo")
    , @NamedQuery(name = "TbQueijo.findByQte", query = "SELECT t FROM TbQueijo t WHERE t.qte = :qte")
    , @NamedQuery(name = "TbQueijo.findByNmQueijo", query = "SELECT t FROM TbQueijo t WHERE t.nmQueijo = :nmQueijo")
    , @NamedQuery(name = "TbQueijo.findByPreco", query = "SELECT t FROM TbQueijo t WHERE t.preco = :preco")
    , @NamedQuery(name = "TbQueijo.findByDescr", query = "SELECT t FROM TbQueijo t WHERE t.descr = :descr")
    , @NamedQuery(name = "TbQueijo.findByCaminhoimg", query = "SELECT t FROM TbQueijo t WHERE t.caminhoimg = :caminhoimg")})
public class TbQueijo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_queijo")
    private Integer idQueijo;
    @Column(name = "qte")
    private Integer qte;
    @Size(max = 60)
    @Column(name = "nm_queijo")
    private String nmQueijo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Size(max = 255)
    @Column(name = "descr")
    private String descr;
    @Size(max = 60)
    @Column(name = "caminhoimg")
    private String caminhoimg;
    @OneToMany(mappedBy = "idQueijo")
    private Collection<TbLancheCriados> tbLancheCriadosCollection;

    public TbQueijo() {
    }

    public TbQueijo(Integer idQueijo) {
        this.idQueijo = idQueijo;
    }

    public Integer getIdQueijo() {
        return idQueijo;
    }

    public void setIdQueijo(Integer idQueijo) {
        this.idQueijo = idQueijo;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public String getNmQueijo() {
        return nmQueijo;
    }

    public void setNmQueijo(String nmQueijo) {
        this.nmQueijo = nmQueijo;
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
        hash += (idQueijo != null ? idQueijo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbQueijo)) {
            return false;
        }
        TbQueijo other = (TbQueijo) object;
        if ((this.idQueijo == null && other.idQueijo != null) || (this.idQueijo != null && !this.idQueijo.equals(other.idQueijo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.TbQueijo[ idQueijo=" + idQueijo + " ]";
    }
    
}
