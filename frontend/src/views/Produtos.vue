<template>
  <div class="principal">
      <div class="principal">
          <h1>Produtos</h1>
          <div v-for="dado in dados" :key="dado.id">
              <ul>
                  <li>
                      {{ dado.id }} - {{ dado.nome }} - {{ dado.estoque }} - {{ dinheiro(dado.preco) }}
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

<style>

</style>