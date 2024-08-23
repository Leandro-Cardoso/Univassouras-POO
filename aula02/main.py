from Automovel import Carro, Moto

carro1 = Carro('Fiat', 'Uno', 2015, 'preto', 'automatico')
carro2 = Carro('Jeep', 'Compass', 2023, 'preto', 'automatico')

moto1 = Moto('marca A', 'modelo A', 2024, 'verde', 250)
moto2 = Moto('marca B', 'modelo B', 2020, 'laranja', 300)

print(carro1)

carro1.start()
carro1.acelerar(50)
carro1.acelerar(50)
carro1.desligar()

print(carro2)

print(moto1)
print(moto2)
