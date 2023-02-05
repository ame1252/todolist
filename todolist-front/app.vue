<script setup lang="ts">
import { ref, onMounted } from 'vue'

const items = ref<TodoItem[]>([]);

const fetchItems = async () => {
  const hopge = fetch('http://localhost:8080/')
    .then(res => res.json())
    .then(data => items.value = data)
}

// 最初に実行する
onMounted(() => {
  fetchItems()
})

</script>

<template>
  <div>
    <ul>
      <li v-for="item in items" :key="item.id">
        <p>{{ item.id }}</p>
        <p>{{ item.title }}</p>
        <p>{{ item.body }}</p>
        <p>{{ item.is_completed }}</p>
      </li>
    </ul>
  </div>
</template>
