import axios from 'axios';

// Cria url da API
const api = axios.create({
  baseURL: 'http://localhost:8081',
});

const handleGet = async (endpoint) => {
  try {
    const response = await api.get(endpoint);

    // Retorna os dados da API e erro null
    return { data: response.data, error: null };
  } catch (error) {
    // Retorna dados nulos e mensagem de erro
    return { data: null, error: error.message };
  }
};

// Recebe a URL e os dados da API para enviar os dados
const handlePost = async (endpoint, data) => {
  try {
    const response = await api.post(endpoint, data);

    return { data: response.data, error: null };
  } catch (error) {
    return { data: null, error: error.message };
  }
};
// Recebe a URL e os dados da API para alterar os dados
const handlePut = async (endpoint, data) => {
  try {
    const response = await api.put(endpoint, data);

    return { data: response.data, error: null };
  } catch (error) {
    return { data: null, error: error.message };
  }
};

// Recebe a URL da API para excluir um campo
const handleDelete = async (endpoint) => {
  try {
    const response = await api.delete(endpoint);

    return { data: response.data, error: null };
  } catch (error) {
    return { data: null, error: error.message };
  }
};

export const apiService = {
  get: handleGet,
  post: handlePost,
  put: handlePut,
  delete: handleDelete,
};
