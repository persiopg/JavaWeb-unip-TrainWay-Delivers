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
@Table(name = "tb_endereco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEndereco.findAll", query = "SELECT t FROM TbEndereco t")
    , @NamedQuery(name = "TbEndereco.findByIdEnd", query = "SELECT t FROM TbEndereco t WHERE t.idEnd = :idEnd")
    , @NamedQuery(name = "TbEndereco.findByRua", query = "SELECT t FROM TbEndereco t WHERE t.rua = :rua")
    , @NamedQuery(name = "TbEndereco.findByNumero", query = "SELECT t FROM TbEndereco t WHERE t.numero = :numero")
    , @NamedQuery(name = "TbEndereco.findByComplemento", query = "SELECT t FROM TbEndereco t WHERE t.complemento = :complemento")
    , @NamedQuery(name = "TbEndereco.findByBairro", query = "SELECT t FROM TbEndereco t WHERE t.bairro = :bairro")
    , @NamedQuery(name = "TbEndereco.findByCidade", query = "SELECT t FROM TbEndereco t WHERE t.cidade = :cidade")
    , @NamedQuery(name = "TbEndereco.findByCep", query = "SELECT t FROM TbEndereco t WHERE t.cep = :cep")})
public class TbEndereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_end")
    private Integer idEnd;
    @Size(max = 60)
    @Column(name = "rua")
    private String rua;
    @Size(max = 5)
    @Column(name = "numero")
    private String numero;
    @Size(max = 15)
    @Column(name = "complemento")
    private String complemento;
    @Size(max = 60)
    @Column(name = "bairro")
    private String bairro;
    @Size(max = 60)
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "cep")
    private Integer cep;
    @OneToMany(mappedBy = "idEnd")
    private Collection<TbCliente> tbClienteCollection;

    public TbEndereco() {
    }

    public TbEndereco(Integer idEnd) {
        this.idEnd = idEnd;
    }

    public Integer getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(Integer idEnd) {
        this.idEnd = idEnd;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    @XmlTransient
    public Collection<TbCliente> getTbClienteCollection() {
        return tbClienteCollection;
    }

    public void setTbClienteCollection(Collection<TbCliente> tbClienteCollection) {
        this.tbClienteCollection = tbClienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEnd != null ? idEnd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEndereco)) {
            return false;
        }
        TbEndereco other = (TbEndereco) object;
        if ((this.idEnd == null && other.idEnd != null) || (this.idEnd != null && !this.idEnd.equals(other.idEnd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.TbEndereco[ idEnd=" + idEnd + " ]";
    }
    
}
