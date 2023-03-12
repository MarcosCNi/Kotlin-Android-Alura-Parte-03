package br.com.alura.orgs.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.alura.orgs.model.Produto

@Dao
interface ProdutoDao {

    @Query("SELECT * FROM Produto")
    fun buscaProdutos() : List<Produto>

    @Insert
    fun salvaProduto(produto: Produto)
}