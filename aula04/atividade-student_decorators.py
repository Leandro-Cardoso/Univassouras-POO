class Student():
    def __init__(self, name, age) -> None:
        self.name = name
        self.age = age
        self.grades = []


    def add_grades(self, grade):
        self.grades.append(grade)

    def get_average_grade(self):
        n = len(self.grades)
        if n == 0:
            return 0
        else:
            return sum(self.grades) / n
        
    @property
    def is_passing(self):
        return self.get_average_grade() >= 60
    
    @classmethod
    def main(cls):
        students = []
        while True:
            print('\n 1 - Adicionar aluno')
            print(' 2 - Adicionar nota')
            print(' 3 - Verificar aprovação')
            print(' 4 - Sair')
            choice = int(input('\nEscolha uma opção: '))
            if choice == 1:
                name = input('\nNome do aluno: ')
                age = int(input('Idade do aluno: '))
                student = cls(name, age)
                students.append(student)
                print('Aluno adicionado!')
            elif choice == 2:
                if not students:
                    print('\nNão há alunos cadastrados!')
                for idx, student in enumerate(students):
                    print(f' {idx + 1} - {student.name}')
                student_idx = int(input('\nEscolha o número do aluno: ')) - 1
                if 0 <= student_idx < len(students):
                    grade = float(input('Nota do aluno: '))
                    students[student_idx].add_grades(grade)
                    print('Nota adicionada!')
                else:
                    print('\nIndice do aluno inválido!')
            elif choice == 3:
                if not students:
                    print('\nNão há alunos cadastrados!')
                for student in students:
                    average_grade = student.get_average_grade()
                    if average_grade >= 6:
                        status = 'Aprovado'
                    else:
                        status = 'Reprovado'
                print(f'\n{student.name}:\n - Média: {average_grade}\n - Status: {status}')
            elif choice == 4:
                print('\nSaindo...')
                print('Obrigado por usar o nosso sistema!')
                print('Até a próxima!\n')
                break
            else:
                print('\nOpção inválida... Tente novamente!')

if __name__ == '__main__':
    Student.main()
