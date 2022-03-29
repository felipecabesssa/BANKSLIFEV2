<template>
  <div>
      <div class="categorias">
        <h1>Categorias</h1>

        <div class="list">
            {{ categorias }}
        </div>

      </div>
  </div>
</template>

<script>

import axios from 'axios'

export default {
    data(){
        return {
            categorias:{}
        }
    },
    methods:{
        getCategorias(){
            axios.get('http://localhost:8081/categorias')
                .then(resp => {
                    this.categorias = resp.data
                })
        }
    },
    created(){
        this.getCategorias()
    }
}

</script>

<style>

</style>