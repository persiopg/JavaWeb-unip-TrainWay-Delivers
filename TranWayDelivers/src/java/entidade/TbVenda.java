/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tb_venda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbVenda.findAll", query = "SELECT t FROM TbVenda t")
    , @NamedQuery(name = "TbVenda.findByIdVenda", query = "SELECT t FROM TbVenda t WHERE t.idVenda = :idVenda")
    , @NamedQuery(name = "TbVenda.findByDataVenda", query = "SELECT t FROM TbVenda t WHERE t.dataVenda = :dataVenda")
    , @NamedQuery(name = "TbVenda.findByHora", query = "SELECT t FROM TbVenda t WHERE t.hora = :hora")
    , @NamedQuery(name = "TbVenda.findByQteItens", query = "SELECT t FROM TbVenda t WHERE t.qteItens = :qteItens")})
public class TbVenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_venda")
    private Integer idVenda;
    @Size(max = 60)
    @Column(name = "data_venda")
    private String dataVenda;
    @Size(max = 60)
    @Column(name = "hora")
    private String hora;
    @Column(name = "qte_itens")
    private Integer qteItens;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private TbCliente idCliente;
    @JoinColumn(name = "id_lc_criado", referencedColumnName = "id_lc_criado")
    @ManyToOne
    private TbLancheCriados idLcCriado;
    @JoinColumn(name = "id_lanches", referencedColumnName = "id_lanche")
    @ManyToOne
    private TbLanches idLanches;

    public TbVenda() {
    }

    public TbVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getQteItens() {
        return qteItens;
    }

    public void setQteItens(Integer qteItens) {
        this.qteItens = qteItens;
    }

    public TbCliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(TbCliente idCliente) {
        this.idCliente = idCliente;
    }

    public TbLancheCriados getIdLcCriado() {
        return idLcCriado;
    }

    public void setIdLcCriado(TbLancheCriados idLcCriado) {
        this.idLcCriado = idLcCriado;
    }

    public TbLanches getIdLanches() {
        return idLanches;
    }

    public void setIdLanches(TbLanches idLanches) {
        this.idLanches = idLanches;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenda != null ? idVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbVenda)) {
            return false;
        }
        TbVenda other = (TbVenda) object;
        if ((this.idVenda == null && other.idVenda != null) || (this.idVenda != null && !this.idVenda.equals(other.idVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.TbVenda[ idVenda=" + idVenda + " ]";
    }
    
}
