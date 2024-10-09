A=[0.0]*10
m = [0.0]*10
tam=len(A)
for i in range (tam):
    A[i] = float(input("Digite um número: "))
x = float(input("Digite mais um número: "))
for n in range(tam):
    m[n] = A[n] * x
print (m)