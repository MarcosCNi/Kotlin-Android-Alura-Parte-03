package br.com.alura.orgs.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import br.com.alura.orgs.model.Produto

@Dao
interface ProdutoDao {

    @Query("SELECT * FROM Produto")
    fun buscaProdutos() : List<Produto>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun salvaProduto(vararg produto: Produto)

    @Delete
    fun removeProduto(produto: Produto)

    @Query("SELECT * FROM Produto WHERE id = :id")
    fun buscaProdutoPorId(id: Long) : Produto?
}