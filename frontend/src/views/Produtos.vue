<template>
  <div class="principal">
      <div class="principal">
          <h1>Produtos</h1>

          <ul>
                  <li>
                      <div class="dados" id="id">id</div>
                      <div class="dados" id="nome">Nome</div>
                      <div class="dados" id="estoque">Estoque</div>
                      <div class="dados" id="preco">Preco</div> 
                  </li>
              </ul>

          <div v-for="dado in dados" :key="dado.id">
              <ul>
                  <li>
                      <div class="dados" id="id">{{ dado.id }}</div>
                      <div class="dados" id="nome">{{ dado.nome }}</div>
                      <div class="dados" id="estoque">{{ dado.estoque }}</div>
                      <div class="dados" id="preco">{{ dinheiro(dado.preco) }}</div> 
                  </li>
              </ul>
          </div>

          <hr>

          <div class="mt-4" v-for="dado in dados" :key="dado.id">
              <div v-if="dado.categoria.nome == 'Shapes'">{{ dado.nome }} - {{ dinheiro(dado.preco) }}</div>
          </div>  

      </div>
  </div>
</template>

<script>

import dados from './../data/data.json'

export default {
    data(){
        return {
            dados:dados
        }
    },

    methods:{

        dinheiro(valor){
        return 'R$ ' + valor.toFixed(2)
        }
    }
  
}
</script>

<style lang="scss" scoped>
  .principal{
    padding: 1%;
    padding-top: 0.1%;
    margin-top: -1%;
    ul{
      list-style: none;
      li{
        display: flex;
        justify-content: space-between;
        border: solid 1px grey;
      }
      .dados{
        padding: 0.5%;
        border-left: solid 1px grey;
        border-right: solid 1px grey;
      }
      #id{
        min-width: 10%;
        border-left: none;
      }
      #nome{
        min-width: 50%;
        color: #42b983;
        border: none;
      }
      #descricao{
        min-width: 50%;
        border: none;
      }
      #estoque{
        min-width: 10%;
        min-width: 80px;
      }
      #preco{
        min-width: 14%;
        border-right: none;
        min-width: 100px;
      }
    }
  }

</style>