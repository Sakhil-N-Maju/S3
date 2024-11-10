
#include <stdio.h>
#include <stdlib.h>

#define SIZE 20

struct DataItem {
   int data;   
   int key;
};

struct DataItem* hashArray[SIZE]; 
struct DataItem* dummyItem;
struct DataItem* item;

int hashCode(int key) {
   return key % SIZE;
}

struct DataItem *search(int key) {
   int hashIndex = hashCode(key);  
   while(hashArray[hashIndex] != NULL) {
      if(hashArray[hashIndex]->key == key) {
         printf("Element found: %d\n", hashArray[hashIndex]->data);
         return hashArray[hashIndex];
      }
      ++hashIndex;
      hashIndex %= SIZE;
   }
   printf("Element not found\n");
   return NULL;        
}

void insert(int key, int data) {
    struct DataItem *item = (struct DataItem*) malloc(sizeof(struct DataItem));
    item->data = data;  
    item->key = key;
    int hashIndex = hashCode(key);
    while(hashArray[hashIndex] != NULL && hashArray[hashIndex]->key != -1) {
        ++hashIndex;
        hashIndex %= SIZE;
    }
    hashArray[hashIndex] = item;
    printf("Inserted (%d, %d)\n", key, data);
}

struct DataItem* delete(struct DataItem* item) {
    int key = item->key;
    int hashIndex = hashCode(key);
    while(hashArray[hashIndex] != NULL) {
        if(hashArray[hashIndex]->key == key) {
            struct DataItem* temp = hashArray[hashIndex]; 
            hashArray[hashIndex] = dummyItem; 
            printf("Deleted key: %d, value: %d\n", temp->key, temp->data);
            return temp;
        }
        ++hashIndex;
        hashIndex %= SIZE;
    }
    printf("Element not found for deletion\n");
    return NULL;        
}

void display() {
    for(int i = 0; i < SIZE; i++) {
        if(hashArray[i] != NULL)
            printf(" (%d,%d)", hashArray[i]->key, hashArray[i]->data);
        else
            printf(" ~~ ");
    }
    printf("\n");
}

int main() {
    dummyItem = (struct DataItem*) malloc(sizeof(struct DataItem));
    dummyItem->data = -1;  
    dummyItem->key = -1; 

    insert(1, 20);
    insert(2, 70);
    insert(42, 80);
    insert(4, 25);
    insert(12, 44);
    insert(14, 32);
    insert(17, 11);
    insert(13, 78);
    insert(37, 97);

    display();

    item = search(37);
    delete(item);
    search(37);
}

