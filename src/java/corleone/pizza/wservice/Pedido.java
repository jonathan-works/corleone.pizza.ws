
package corleone.pizza.wservice;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id")
    , @NamedQuery(name = "Pedido.findByUsuario", query = "SELECT p FROM Pedido p WHERE p.usuario = :usuario")
    , @NamedQuery(name = "Pedido.findByPedido1", query = "SELECT p FROM Pedido p WHERE p.pedido1 = :pedido1")
    , @NamedQuery(name = "Pedido.findByQuantidade1", query = "SELECT p FROM Pedido p WHERE p.quantidade1 = :quantidade1")
    , @NamedQuery(name = "Pedido.findByPedido2", query = "SELECT p FROM Pedido p WHERE p.pedido2 = :pedido2")
    , @NamedQuery(name = "Pedido.findByQuantidade2", query = "SELECT p FROM Pedido p WHERE p.quantidade2 = :quantidade2")
    , @NamedQuery(name = "Pedido.findByPedido3", query = "SELECT p FROM Pedido p WHERE p.pedido3 = :pedido3")
    , @NamedQuery(name = "Pedido.findByQuantidade3", query = "SELECT p FROM Pedido p WHERE p.quantidade3 = :quantidade3")
    , @NamedQuery(name = "Pedido.findByEndereco", query = "SELECT p FROM Pedido p WHERE p.endereco = :endereco")
    , @NamedQuery(name = "Pedido.findByTelefone", query = "SELECT p FROM Pedido p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Pedido.findByFormaPagamento", query = "SELECT p FROM Pedido p WHERE p.formaPagamento = :formaPagamento")
    , @NamedQuery(name = "Pedido.findByDataCompra", query = "SELECT p FROM Pedido p WHERE p.dataCompra = :dataCompra")
    , @NamedQuery(name = "Pedido.findByValorTotal", query = "SELECT p FROM Pedido p WHERE p.valorTotal = :valorTotal")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "pedido1")
    private String pedido1;
    @Column(name = "quantidade1")
    private String quantidade1;
    @Column(name = "pedido2")
    private String pedido2;
    @Column(name = "quantidade2")
    private String quantidade2;
    @Column(name = "pedido3")
    private String pedido3;
    @Column(name = "quantidade3")
    private String quantidade3;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "forma_pagamento")
    private String formaPagamento;
    @Column(name = "data_compra")
    private String dataCompra;
    @Column(name = "valor_total")
    private String valorTotal;

    public Pedido() {
    }

    public Pedido(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPedido1() {
        return pedido1;
    }

    public void setPedido1(String pedido1) {
        this.pedido1 = pedido1;
    }

    public String getQuantidade1() {
        return quantidade1;
    }

    public void setQuantidade1(String quantidade1) {
        this.quantidade1 = quantidade1;
    }

    public String getPedido2() {
        return pedido2;
    }

    public void setPedido2(String pedido2) {
        this.pedido2 = pedido2;
    }

    public String getQuantidade2() {
        return quantidade2;
    }

    public void setQuantidade2(String quantidade2) {
        this.quantidade2 = quantidade2;
    }

    public String getPedido3() {
        return pedido3;
    }

    public void setPedido3(String pedido3) {
        this.pedido3 = pedido3;
    }

    public String getQuantidade3() {
        return quantidade3;
    }

    public void setQuantidade3(String quantidade3) {
        this.quantidade3 = quantidade3;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "corleone.pizza.wservice.Pedido[ id=" + id + " ]";
    }
    
}
