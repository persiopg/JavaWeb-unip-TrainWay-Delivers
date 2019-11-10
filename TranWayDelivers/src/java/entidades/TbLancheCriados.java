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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tb_lanche_criados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbLancheCriados.findAll", query = "SELECT t FROM TbLancheCriados t")
    , @NamedQuery(name = "TbLancheCriados.findByIdLcCriado", query = "SELECT t FROM TbLancheCriados t WHERE t.idLcCriado = :idLcCriado")
    , @NamedQuery(name = "TbLancheCriados.findByQtepao", query = "SELECT t FROM TbLancheCriados t WHERE t.qtepao = :qtepao")
    , @NamedQuery(name = "TbLancheCriados.findByQtemolho", query = "SELECT t FROM TbLancheCriados t WHERE t.qtemolho = :qtemolho")
    , @NamedQuery(name = "TbLancheCriados.findByQtehambuger", query = "SELECT t FROM TbLancheCriados t WHERE t.qtehambuger = :qtehambuger")
    , @NamedQuery(name = "TbLancheCriados.findByQtesalada", query = "SELECT t FROM TbLancheCriados t WHERE t.qtesalada = :qtesalada")
    , @NamedQuery(name = "TbLancheCriados.findByQtequeijo", query = "SELECT t FROM TbLancheCriados t WHERE t.qtequeijo = :qtequeijo")
    , @NamedQuery(name = "TbLancheCriados.findByQtecond", query = "SELECT t FROM TbLancheCriados t WHERE t.qtecond = :qtecond")})
public class TbLancheCriados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lc_criado")
    private Integer idLcCriado;
    @Column(name = "qtepao")
    private Integer qtepao;
    @Column(name = "qtemolho")
    private Integer qtemolho;
    @Column(name = "qtehambuger")
    private Integer qtehambuger;
    @Column(name = "qtesalada")
    private Integer qtesalada;
    @Column(name = "qtequeijo")
    private Integer qtequeijo;
    @Column(name = "qtecond")
    private Integer qtecond;
    @JoinColumn(name = "id_cond", referencedColumnName = "id_cond")
    @ManyToOne
    private TbCondimentos idCond;
    @JoinColumn(name = "id_hambuger", referencedColumnName = "id_hambuger")
    @ManyToOne
    private TbHambuger idHambuger;
    @JoinColumn(name = "id_molho", referencedColumnName = "id_molho")
    @ManyToOne
    private TbMolho idMolho;
    @JoinColumn(name = "id_pao", referencedColumnName = "id_pao")
    @ManyToOne
    private TbPao idPao;
    @JoinColumn(name = "id_queijo", referencedColumnName = "id_queijo")
    @ManyToOne
    private TbQueijo idQueijo;
    @JoinColumn(name = "id_salada", referencedColumnName = "id_salada")
    @ManyToOne
    private TbSalada idSalada;
    @OneToMany(mappedBy = "idLcCriado")
    private Collection<TbVenda> tbVendaCollection;

    public TbLancheCriados() {
    }

    public TbLancheCriados(Integer idLcCriado) {
        this.idLcCriado = idLcCriado;
    }

    public Integer getIdLcCriado() {
        return idLcCriado;
    }

    public void setIdLcCriado(Integer idLcCriado) {
        this.idLcCriado = idLcCriado;
    }

    public Integer getQtepao() {
        return qtepao;
    }

    public void setQtepao(Integer qtepao) {
        this.qtepao = qtepao;
    }

    public Integer getQtemolho() {
        return qtemolho;
    }

    public void setQtemolho(Integer qtemolho) {
        this.qtemolho = qtemolho;
    }

    public Integer getQtehambuger() {
        return qtehambuger;
    }

    public void setQtehambuger(Integer qtehambuger) {
        this.qtehambuger = qtehambuger;
    }

    public Integer getQtesalada() {
        return qtesalada;
    }

    public void setQtesalada(Integer qtesalada) {
        this.qtesalada = qtesalada;
    }

    public Integer getQtequeijo() {
        return qtequeijo;
    }

    public void setQtequeijo(Integer qtequeijo) {
        this.qtequeijo = qtequeijo;
    }

    public Integer getQtecond() {
        return qtecond;
    }

    public void setQtecond(Integer qtecond) {
        this.qtecond = qtecond;
    }

    public TbCondimentos getIdCond() {
        return idCond;
    }

    public void setIdCond(TbCondimentos idCond) {
        this.idCond = idCond;
    }

    public TbHambuger getIdHambuger() {
        return idHambuger;
    }

    public void setIdHambuger(TbHambuger idHambuger) {
        this.idHambuger = idHambuger;
    }

    public TbMolho getIdMolho() {
        return idMolho;
    }

    public void setIdMolho(TbMolho idMolho) {
        this.idMolho = idMolho;
    }

    public TbPao getIdPao() {
        return idPao;
    }

    public void setIdPao(TbPao idPao) {
        this.idPao = idPao;
    }

    public TbQueijo getIdQueijo() {
        return idQueijo;
    }

    public void setIdQueijo(TbQueijo idQueijo) {
        this.idQueijo = idQueijo;
    }

    public TbSalada getIdSalada() {
        return idSalada;
    }

    public void setIdSalada(TbSalada idSalada) {
        this.idSalada = idSalada;
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
        hash += (idLcCriado != null ? idLcCriado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbLancheCriados)) {
            return false;
        }
        TbLancheCriados other = (TbLancheCriados) object;
        if ((this.idLcCriado == null && other.idLcCriado != null) || (this.idLcCriado != null && !this.idLcCriado.equals(other.idLcCriado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbLancheCriados[ idLcCriado=" + idLcCriado + " ]";
    }
    
}
