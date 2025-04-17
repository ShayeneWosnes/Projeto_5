package br.edu.ifpr.bsi.projetodisciplina.dao;

import br.edu.ifpr.bsi.projetodisciplina.helpers.HibernateHelper;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.ParameterizedType;

/*
* Conceito de Generics <>
* O objeto pode se converter em outro tipo de objeto posteriormente.
*/
public class GenericDAO <Entidade> {
    private Class<Entidade> classe;

    @SuppressWarnings("unchecked")
    public GenericDAO(){
        this.classe = ( Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @SuppressWarnings("unchecked")
    public void salvar(Entidade entidade) {
        Transaction transacao = null;
        Session sessao = HibernateHelper.getFabricaDeSessoes().openSession();
        try {
            transacao = sessao.beginTransaction();
            sessao.persist(entidade);
            transacao.commit();
        } catch (RuntimeException erro) {
            if (transacao != null) {
                transacao.rollback();
                throw erro;
            }
        } finally {
            sessao.close();
        }
    }
}
