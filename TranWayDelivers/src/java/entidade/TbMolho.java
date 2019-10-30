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
@Table(name = "tb_molho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMolho.findAll", query = "SELECT t FROM TbMolho t")
    , @NamedQuery(name = "TbMolho.findByIdMolho", query = "SELECT t FROM TbMolho t WHERE t.idMolho = :idMolho")
    , @NamedQuery(name = "TbMolho.findByNmMolho", query = "SELECT t FROM TbMolho t WHERE t.nmMolho = :nmMolho")
    , @NamedQuery(name = "TbMolho.findByQte", query = "SELECT t FROM TbMolho t WHERE t.qte = :qte")
    , @NamedQuery(name = "TbMolho.findByPreco", query = "SELECT t FROM TbMolho t WHERE t.preco = :preco")
    , @NamedQuery(name = "TbMolho.findByDescr", query = "SELECT t FROM TbMolho t WHERE t.descr = :descr")
    , @NamedQuery(name = "TbMolho.findByCaminhoimg", query = "SELECT t FROM TbMolho t WHERE t.caminhoimg = :caminhoimg")})
public class TbMolho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_molho")
    private Integer idMolho;
    @Size(max = 60)
    @Column(name = "nm_molho")
    private String nmMolho;
    @Column(name = "qte")
    private Integer qte;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Size(max = 255)
    @Column(name = "descr")
    private String descr;
    @Size(max = 60)
    @Column(name = "caminhoimg")
    private String caminhoimg;
    @OneToMany(mappedBy = "idMolho")
    private Collection<TbLancheCriados> tbLancheCriadosCollection;

    public TbMolho() {
    }

    public TbMolho(Integer idMolho) {
        this.idMolho = idMolho;
    }

    public Integer getIdMolho() {
        return idMolho;
    }

    public void setIdMolho(Integer idMolho) {
        this.idMolho = idMolho;
    }

    public String getNmMolho() {
        return nmMolho;
    }

    public void setNmMolho(String nmMolho) {
        this.nmMolho = nmMolho;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
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
        hash += (idMolho != null ? idMolho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbMolho)) {
            return false;
        }
        TbMolho other = (TbMolho) object;
        if ((this.idMolho == null && other.idMolho != null) || (this.idMolho != null && !this.idMolho.equals(other.idMolho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.TbMolho[ idMolho=" + idMolho + " ]";
    }
    
}
