from Pessoa import *

ze_das_coves = Pessoa(
    "Zé das Coves", 1.70, "zezimdascoves@email.com", 
    "12345678900", "+552226364512", "Rua da Felicidade, 22, Raia, Saquarema - RJ"
)

print(
    f"""
Nome {ze_das_coves.nome}
Altura {ze_das_coves.altura}
email {ze_das_coves.email}
CPF {ze_das_coves.cpf}
Telefone {ze_das_coves.telefone}
Endereço {ze_das_coves.endereco}
Zé das Coves é um {ze_das_coves.objeto}
    """
)

ze_das_coves.desagradar_o_outro()