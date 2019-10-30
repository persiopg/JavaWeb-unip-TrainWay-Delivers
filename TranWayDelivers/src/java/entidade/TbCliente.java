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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCliente.findAll", query = "SELECT t FROM TbCliente t")
    , @NamedQuery(name = "TbCliente.findByIdCliente", query = "SELECT t FROM TbCliente t WHERE t.idCliente = :idCliente")
    , @NamedQuery(name = "TbCliente.findByNmCliente", query = "SELECT t FROM TbCliente t WHERE t.nmCliente = :nmCliente")
    , @NamedQuery(name = "TbCliente.findByApelido", query = "SELECT t FROM TbCliente t WHERE t.apelido = :apelido")
    , @NamedQuery(name = "TbCliente.findBySenha", query = "SELECT t FROM TbCliente t WHERE t.senha = :senha")
    , @NamedQuery(name = "TbCliente.findByCpf", query = "SELECT t FROM TbCliente t WHERE t.cpf = :cpf")})
public class TbCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Size(max = 120)
    @Column(name = "nm_cliente")
    private String nmCliente;
    @Size(max = 60)
    @Column(name = "apelido")
    private String apelido;
    @Size(max = 160)
    @Column(name = "senha")
    private String senha;
    @Size(max = 25)
    @Column(name = "cpf")
    private String cpf;
    @OneToMany(mappedBy = "idCliente")
    private Collection<TbCardCredit> tbCardCreditCollection;
    @JoinColumn(name = "id_end", referencedColumnName = "id_end")
    @ManyToOne
    private TbEndereco idEnd;
    @OneToMany(mappedBy = "idCliente")
    private Collection<TbVenda> tbVendaCollection;

    public TbCliente() {
    }

    public TbCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @XmlTransient
    public Collection<TbCardCredit> getTbCardCreditCollection() {
        return tbCardCreditCollection;
    }

    public void setTbCardCreditCollection(Collection<TbCardCredit> tbCardCreditCollection) {
        this.tbCardCreditCollection = tbCardCreditCollection;
    }

    public TbEndereco getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(TbEndereco idEnd) {
        this.idEnd = idEnd;
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
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCliente)) {
            return false;
        }
        TbCliente other = (TbCliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.TbCliente[ idCliente=" + idCliente + " ]";
    }
    
}
