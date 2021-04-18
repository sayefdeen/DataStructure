'use strict';

const Node = require('./Node');

class Queue {
  constructor() {
    this.first = null;
  }

  enqueue(data) {
    const newNode = new Node(data);
    if (!this.first) {
      this.first = newNode;
      return this;
    }
    const current = this.first;
    while (current.next) {
      current = current.next;
    }
    current.next = newNode;
    return this;
  }

  dequeue() {
    const removed = this.first.data;
    this.first = this.first.next;
    return removed;
  }

  peek() {
    return this.first.data;
  }

  display() {
    let output = '';
    let current = this.first;
    while (current) {
      output += `${current.data} --> `;
      current = current.next;
    }
    return output;
  }
  isEmpty() {
    return this.first ? false : true;
  }

  length() {
    let counter = 0;
    let current = this.first;
    while (current) {
      counter++;
      current = current.next;
    }
    return counter;
  }
}
