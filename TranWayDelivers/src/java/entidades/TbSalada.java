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
@Table(name = "tb_salada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSalada.findAll", query = "SELECT t FROM TbSalada t")
    , @NamedQuery(name = "TbSalada.findByIdSalada", query = "SELECT t FROM TbSalada t WHERE t.idSalada = :idSalada")
    , @NamedQuery(name = "TbSalada.findByQte", query = "SELECT t FROM TbSalada t WHERE t.qte = :qte")
    , @NamedQuery(name = "TbSalada.findByNmSalada", query = "SELECT t FROM TbSalada t WHERE t.nmSalada = :nmSalada")
    , @NamedQuery(name = "TbSalada.findByPreco", query = "SELECT t FROM TbSalada t WHERE t.preco = :preco")
    , @NamedQuery(name = "TbSalada.findByDescr", query = "SELECT t FROM TbSalada t WHERE t.descr = :descr")
    , @NamedQuery(name = "TbSalada.findByCaminhoimg", query = "SELECT t FROM TbSalada t WHERE t.caminhoimg = :caminhoimg")})
public class TbSalada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_salada")
    private Integer idSalada;
    @Column(name = "qte")
    private Integer qte;
    @Size(max = 60)
    @Column(name = "nm_salada")
    private String nmSalada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Size(max = 255)
    @Column(name = "descr")
    private String descr;
    @Size(max = 60)
    @Column(name = "caminhoimg")
    private String caminhoimg;
    @OneToMany(mappedBy = "idSalada")
    private Collection<TbLancheCriados> tbLancheCriadosCollection;

    public TbSalada() {
    }

    public TbSalada(Integer idSalada) {
        this.idSalada = idSalada;
    }

    public Integer getIdSalada() {
        return idSalada;
    }

    public void setIdSalada(Integer idSalada) {
        this.idSalada = idSalada;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public String getNmSalada() {
        return nmSalada;
    }

    public void setNmSalada(String nmSalada) {
        this.nmSalada = nmSalada;
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
        hash += (idSalada != null ? idSalada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSalada)) {
            return false;
        }
        TbSalada other = (TbSalada) object;
        if ((this.idSalada == null && other.idSalada != null) || (this.idSalada != null && !this.idSalada.equals(other.idSalada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbSalada[ idSalada=" + idSalada + " ]";
    }
    
}
