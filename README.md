# 🦁 Домашнє завдання: Система управління зоопарком 🐘

Вітаємо в світі Java-програмування! 🎉 Сьогодні ви створите власну систему управління зоопарком, використовуючи принципи наслідування, пакети та модифікатори доступу.

## 📋 Опис завдання

Ваше завдання - створити ієрархію класів для системи зоопарку, де різні тварини мають спільні властивості, але також мають свої унікальні особливості.

### 🎯 Цілі завдання:
- Закріпити розуміння наслідування (`extends`)
- Навчитися правильно використовувати `super`
- Освоїти роботу з пакетами та модифікаторами доступу
- Створити цікаву ігрову систему

## 📦 Структура пакетів

Для вас вже заздалегідь створена така структура пакетів і класів
Це буде шаблон з якого ви починаєте виконання завдання
```
src/
└── main/
    └── java/
        └── com/
            └── zoo/
                ├── animals/          # Базові класи тварин
                │   ├── Animal.java
                │   ├── Mammal.java
                │   └── Bird.java
                ├── species/          # Конкретні види тварин
                │   ├── Lion.java
                │   ├── Elephant.java
                │   ├── Eagle.java
                │   └── Penguin.java
                ├── zookeeper/        # Класи працівників
                │   └── ZooKeeper.java
                └── ZooSimulator.java  # Головний клас
```

## 📝 Вимоги до реалізації

### 1. 🐾 Базовий клас Animal
- Має захищені поля: `name`, `age`, `weight` -> мають бути доступні класам-наслідникам
- Має приватне поле `energyLevel` (рівень енергії 0-100)
- Конструктор приймає всі параметри (і задає значення полям)
- Методи:
    - `public void eat()` - збільшує енергію на 20
    - `public void sleep()` - збільшує енергію на 30
    - `protected void makeSound()` - виводить загальний звук
    - `public void displayInfo()` - виводить інформацію про тварину
    - публічні Геттери для всіх полів

### 2. 🦌 Клас Mammal extends Animal
- Додаткове захищене поле `furColor` - містить колір хутра
- Перевизначає `makeSound()` для ссавців
- Додає метод `public void groom()` - догляд за шерстю

### 3. 🦅 Клас Bird extends Animal
- Додаткове захищене поле `wingSpan` - розмах крил
- Перевизначає `makeSound()` для птахів
- Додає метод `public void fly()` - політ (зменшує енергію на 15)

### 4. 🦁 Конкретні тварини
Створіть мінімум 4 види тварин:

#### Lion extends Mammal
- Перевизначає `makeSound()` - "Рррр! 🦁"
- Додає метод `public void hunt()` - полювання (зменшує енергію на 25)

#### Elephant extends Mammal
- Перевизначає `makeSound()` - "Труба-ба-ба! 🐘"
- Додає метод `public void spraySelf()` - обливається водою

#### Eagle extends Bird
- Перевизначає `makeSound()` - "Кріі-кріі! 🦅"
- Перевизначає `fly()` - орел літає довше, тому енергія зменшується на 20

#### Penguin extends Bird
- Перевизначає `makeSound()` - "Кря-кря! 🐧"
- Визначає метод `swim()`
- Перевизначає `fly()` - "Пінгвін не літає, але плаває", викликати свій же метод `swim()`

### 5. 👨‍🔬 Клас ZooKeeper
- Приватне поле `name`
- Методи для догляду за тваринами:
    - `public void feedAnimal(Animal animal)`
    - `public void playWithAnimal(Animal animal)` -> коли з ними граються, звірята роблять свій звук
    - `public void checkAnimalEnergyLevel(Animal animal)` -> повертає для звіряти рівень його енергії: якщо енергія від 0 до 30 - низький, якщо від 31 до 70 середній, якщо від 71 до 100 високий

### 6. 🎮 Клас ZooSimulator (головний клас)
- Створює різних тварин
- Створює доглядача
- Симулює день в зоопарку з різними активностями

## 🎲 Додаткові Ігрові елементи (додавайте за бажанням)

1. **Система енергії**: тварини втомлюються від активностей, коли рівень енергії сягає 0 - тварина засинає і не може робити ніяких активностей поки її не нагодують
2. **Статистика**: підраховуйте, скільки разів кожна тварина їла, спала, видавала звуки
3. **Рівні щастя**: додайте поле `happinessLevel`, яке змінюється залежно від активностей

## ✅ Критерії оцінювання

- ✨ Правильна ієрархія наслідування
- 🔒 Коректне використання модифікаторів доступу
- 📦 Правильна організація пакетів
- 🔄 Використання `super` в конструкторах та методах
- 🎯 Перевизначення методів (`@Override`)
- 🎮 Креативність у реалізації ігрових механік
- 📖 Читабельність та документування коду


## 🤝 Як здавати завдання

1. Реалізуйте всі класи згідно з вимогами
2. Переконайтеся, що код компілується та працює
3. Комітьте та пуште ваші зміни у гілку `main`
4. Після завершення виконання - додайте відмітьте домашку в Google Classroom зробленою та додайте приватний коментар з посиланням на пул реквест `Feedback` з вашого репозиторію

**Удачі в програмуванні! 🌟 Нехай ваш зоопарк стане найкращим у світі Java! 🎊**

---
*💡 Пам'ятайте: головне не просто виконати завдання, а зрозуміти принципи ООП та наслідування!*