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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

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
    , @NamedQuery(name = "TbCliente.findByEmail", query = "SELECT t FROM TbCliente t WHERE t.email = :email")
    , @NamedQuery(name = "TbCliente.findBySenha", query = "SELECT t FROM TbCliente t WHERE t.senha = :senha")
    , @NamedQuery(name = "TbCliente.findByCpf", query = "SELECT t FROM TbCliente t WHERE t.cpf = :cpf")
    , @NamedQuery(name = "TbCliente.findByRua", query = "SELECT t FROM TbCliente t WHERE t.rua = :rua")
    , @NamedQuery(name = "TbCliente.findByNumero", query = "SELECT t FROM TbCliente t WHERE t.numero = :numero")
    , @NamedQuery(name = "TbCliente.findByComplemento", query = "SELECT t FROM TbCliente t WHERE t.complemento = :complemento")
    , @NamedQuery(name = "TbCliente.findByBairro", query = "SELECT t FROM TbCliente t WHERE t.bairro = :bairro")
    , @NamedQuery(name = "TbCliente.findByCidade", query = "SELECT t FROM TbCliente t WHERE t.cidade = :cidade")
    , @NamedQuery(name = "TbCliente.findByCep", query = "SELECT t FROM TbCliente t WHERE t.cep = :cep")})
public class TbCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Size(max = 120)
    @Column(name = "nm_cliente")
    private String nmCliente;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 120)
    @Column(name = "email")
    private String email;
    @Size(max = 160)
    @Column(name = "senha")
    private String senha;
    @Size(max = 25)
    @Column(name = "cpf")
    private String cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "entidades.TbCliente[ idCliente=" + idCliente + " ]";
    }
    
}
