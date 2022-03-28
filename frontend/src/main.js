import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import bootstrap from './bootstrap'

import axios from 'axios'

createApp(App)
.use(store)
.use(router)
.use(bootstrap)
.provide(axios)
.mount('#app')

