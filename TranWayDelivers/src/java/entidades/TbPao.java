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
@Table(name = "tb_pao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPao.findAll", query = "SELECT t FROM TbPao t")
    , @NamedQuery(name = "TbPao.findByIdPao", query = "SELECT t FROM TbPao t WHERE t.idPao = :idPao")
    , @NamedQuery(name = "TbPao.findByQte", query = "SELECT t FROM TbPao t WHERE t.qte = :qte")
    , @NamedQuery(name = "TbPao.findByNmPao", query = "SELECT t FROM TbPao t WHERE t.nmPao = :nmPao")
    , @NamedQuery(name = "TbPao.findByPreco", query = "SELECT t FROM TbPao t WHERE t.preco = :preco")
    , @NamedQuery(name = "TbPao.findByDescr", query = "SELECT t FROM TbPao t WHERE t.descr = :descr")
    , @NamedQuery(name = "TbPao.findByCaminhoimg", query = "SELECT t FROM TbPao t WHERE t.caminhoimg = :caminhoimg")})
public class TbPao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pao")
    private Integer idPao;
    @Column(name = "qte")
    private Integer qte;
    @Size(max = 60)
    @Column(name = "nm_pao")
    private String nmPao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Size(max = 255)
    @Column(name = "descr")
    private String descr;
    @Size(max = 60)
    @Column(name = "caminhoimg")
    private String caminhoimg;
    @OneToMany(mappedBy = "idPao")
    private Collection<TbLancheCriados> tbLancheCriadosCollection;

    public TbPao() {
    }

    public TbPao(Integer idPao) {
        this.idPao = idPao;
    }

    public Integer getIdPao() {
        return idPao;
    }

    public void setIdPao(Integer idPao) {
        this.idPao = idPao;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public String getNmPao() {
        return nmPao;
    }

    public void setNmPao(String nmPao) {
        this.nmPao = nmPao;
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
        hash += (idPao != null ? idPao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPao)) {
            return false;
        }
        TbPao other = (TbPao) object;
        if ((this.idPao == null && other.idPao != null) || (this.idPao != null && !this.idPao.equals(other.idPao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbPao[ idPao=" + idPao + " ]";
    }
    
}
